#!/bin/python3

import sys

def libraryFine(d1, m1, y1, d2, m2, y2):
	# Complete this function
	if y1>y2:
		return 10000
	elif y2 == y1 and m2<m1:
		return 500*(m1-m2)
	elif y2 == y1 and m2 == m1 and d2<d1:
		return 15*(d1-d2)
	else:
		return 0


if __name__ == "__main__":
	d1, m1, y1 = input().strip().split(' ')
	d1, m1, y1 = [int(d1), int(m1), int(y1)]
	d2, m2, y2 = input().strip().split(' ')
	d2, m2, y2 = [int(d2), int(m2), int(y2)]
	result = libraryFine(d1, m1, y1, d2, m2, y2)
	print(result)
