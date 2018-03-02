#!/bin/python3

import sys

def repeatedString(s, n):
	# Complete this function
	#number of repeated strings
	num = int(n/len(s))
	count = s.count('a')
	count = count*num
	if n!=num:
		count += s[0:(n-(num*len(s)))].count('a')
	return count

if __name__ == "__main__":
	s = input().strip()
	n = int(input().strip())
	result = repeatedString(s, n)
	print(result)
