# point_simple.py
# little helper script to auto-generate part of chartsymbols.xml out of a given inlandECDIS lookup table
# Converts CSV file to XML
# ver - 2021-07-14

import sys
import os
import csv

# if len(sys.argv) != 2:
#     os._exit(1)
# path=sys.argv[1] # get folder as a command line argument
# os.chdir(path)
# csvFiles = [f for f in os.listdir('.') if f.endswith('.csv') or f.endswith('.CSV')]

csvFiles = ["pienc24s.dic"]
type = "<type>Point</type>"
tablename = "<table-name>Simplified</table-name>"
tags = ['name','attrib-code','instruction','disp-prio','radar-prio','display-cat','comment']

def openObject():
    numId = str(rowNum)
    numRcid = "{:0>3d}".format(rowNum)
    xmlData.write('\t' + '\t' +'<lookup id="' + numId + '" RCID="24' + numRcid + '" ' + tags[0] + '="' + row[0] + '">' + '\n')

def writeAttributes():
    xmlData.write('\t' + '\t' + '\t' + '<' + tags[i] + '>')
    xmlData.write(row[i])
    xmlData.write('</' + tags[i] + '>' + '\n')

def writeAttributesDispPrio():
    xmlData.write('\t' + '\t' + '\t' + '<' + tags[i] + '>')
    if row[i] == '0':
      xmlData.write('No Data')
    if row[i] == '1':
      xmlData.write('Group 1')
    if row[i] == '2':
      xmlData.write('Area 1')
    if row[i] == '3':
      xmlData.write('Area 2')
    if row[i] == '4':
      xmlData.write('Point Symbol')
    if row[i] == '5':
      xmlData.write('Line Symbol')
    if row[i] == '6':
      xmlData.write('Area Symbol')
    if row[i] == '7':
      xmlData.write('Routing')
    if row[i] == '8':
      xmlData.write('Hazards')
    if row[i] == '9':
      xmlData.write('Mariners')
#    else:
#      xmlData.write(row[i])
    xmlData.write('</' + tags[i] + '>' + '\n')

def writeAttributesRadarPrio():
    xmlData.write('\t' + '\t' + '\t' + '<' + tags[i] + '>')
    if row[i] == 'S':
      xmlData.write('Suppressed')
    if row[i] == 'O':
      xmlData.write('On Top')
#    else:
#      xmlData.write(row[i])
    xmlData.write('</' + tags[i] + '>' + '\n')

def writeAttributesAttribCode():
    # <attrib-code index="0">$SCODEQUESMRK1</attrib-code>

    attribCodes = row[i].split('|')
    # print(attribCodes)
    
    for f in range(len(attribCodes)):
       # print(attribCodes[f])
       if attribCodes[f] != '':
         xmlData.write('\t' + '\t' + '\t' + '<' + tags[i] + ' index="' + str(f) +'">')
         xmlData.write(attribCodes[f])
         xmlData.write('</' + tags[i] + '>' + '\n')
    

def closeObject():
    xmlData.write('\t' + '\t' + '</lookup>' + '\n')

for csvFile in csvFiles:
    xmlFile = csvFile[:-4] + '.xml'
    csvData = csv.reader(open(csvFile))
    xmlData = open(xmlFile, 'w')
    # xmlData.write('<?xml version="1.0"?>' + '\n')

    xmlData.write('<!-- derived from ' + csvFiles[0] + ' start -->' + '\n')
    rowNum = 0
    for row in csvData:
        if rowNum >= 6:
            openObject()
            
            for i in range(len(tags)):
                if i == 0:
                  #print('name')
                  xmlData.write('\t' + '\t' + '\t' + type + '\n')
                if i == 3:
                  #print('disp-prio')
                  writeAttributesDispPrio()
                if i == 4:
                  #print('radar-prio')
                  writeAttributesRadarPrio()
                  xmlData.write('\t' + '\t' + '\t' + tablename + '\n')
                if i == 2:
                  #print('instruction')
                  writeAttributes()
                if i == 1:
                  #print('attrib-code')
                  writeAttributesAttribCode()
                if i == 5:
                  #print('display-cat')
                  writeAttributes()
                if i == 6:
                  #print('comment')
                  writeAttributes()

            closeObject()
        rowNum +=1
    xmlData.write('<!-- derived from ' + csvFiles[0] + ' end -->' + '\n')
    xmlData.close()