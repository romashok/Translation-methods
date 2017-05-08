'''
author Lebedev Roman (lebedeffroman@gmail.com)
version 1.0
'''
from graphviz import Graph


def getDict(line):
    line = line.strip()
    d = {}
    args = line[5:].split(sep=';')
    for arg in args:
        k, v = arg.split(sep='=')
        d[k] = v
    return d


tree = Graph()
with open('out/dump.txt', 'r') as inp:
    for line in inp.readlines():
        d = getDict(line)
        if line.startswith("node"):
            if len(d) > 3:
                tree.node(d['ind'], d['name'], shape=d['shape'], style=d['style'], fillcolor=d['color'])
            else:
                tree.node(d['ind'], d['name'], shape=d['shape'])
        elif line.startswith("edge"):
            tree.edge(d['fromInd'], d['toInd'])

tree.render(filename='out/Parse_tree')
