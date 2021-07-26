#!/usr/bin/env python
#-*- coding: utf-8 -*-
# based on https://github.com/manimaul/mapsforge-senc-rendertheme/opencpn.org-S57-reference/chartsymbolextractor.py /
# use this anyway you want

from xml.dom.minidom import parseString
import os
import svgwrite

f = open("chartsymbols-main.xml", "r")
lines = f.read()
f.close()

dwg = svgwrite.Drawing('chartsymbols-bounding-boxes.svg', profile='tiny')
dwg.add(dwg.rect((0, 0), (1500, 1200), fill="none", stroke="black", stroke_width="0.250"))

dom = parseString(lines)
for symEle in dom.getElementsByTagName("symbol"):
    name = symEle.getElementsByTagName("name")[0].firstChild.nodeValue
    btmEle = symEle.getElementsByTagName("bitmap")
    if len(btmEle) > 0:
        locEle = btmEle[0].getElementsByTagName("graphics-location")
        width = int( btmEle[0].attributes["width"].value )
        height = int( btmEle[0].attributes["height"].value )
        x = int(locEle[0].attributes["x"].value, 10 )
        y = int(locEle[0].attributes["y"].value, 10 )
        
        pivotEle = btmEle[0].getElementsByTagName("pivot")
        pivotX = int( pivotEle[0].attributes["x"].value, 10 )
        if pivotX < 0:
           pivotX = 0
        pivotY = int( pivotEle[0].attributes["y"].value, 10 )
        if pivotY < 0:
           pivotY = 0

        dwg.add(dwg.text(name, insert=(x, y-1), fill="black", stroke="black", stroke_width="0", font_size='1.5pt', font_weight="normal", font_family="sans-serif"))
        dwg.add(dwg.rect((x, y), (width, height), fill="none", stroke="black", stroke_width="0.250"))
        dwg.add(dwg.circle(center=(x+pivotX , y+pivotY), r="1", fill="none", stroke="black", stroke_width="0.250"))

dwg.save()
