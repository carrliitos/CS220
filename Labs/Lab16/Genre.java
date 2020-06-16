//Enumerated Types (enums for short) are types which store all their possible values at compile time
//These are constants of which there are only a finite amount
//Some examples:
//	Days of the week
//	Months
//	Colors
//	Genres
//
//Enums are types and should use the proper case for types (PascalCase)
//Since their values are constants, they should be in ALL_CAPS case in Java

public enum Genre {
	UNKNOWN, //Good practice to always include a 'default', 'invalid', 'unknown', 'empty', etc. value first
	ROCK, //Values are separated by commas. Java is not space sensitive so they can be listed vertically or horizontally
	FUNK,
	JAZZ,
	BLUES,
	POP,
	FOLK,
	CLASSICAL,
	REGGAE,
	HIPHOP,
	ELECTRONIC,
	LATIN
}
