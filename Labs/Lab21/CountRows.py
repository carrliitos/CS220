numRows = -1; # Not including the header
for row in open("Test.csv"):
	numRows += 1

print(numRows)