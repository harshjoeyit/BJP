
// final class, methods use case scenarios 

class ChessAlgorithm {
	enum ChessPlayer { WHITE, BLACK }
	// ...
	final ChessPlayer getFirstPlayer() {
	    return ChessPlayer.WHITE;
	}
	// ...
}

/* 
Methods called from constructors should generally be declared final. 
If a constructor calls a non-final method, a subclass may redefine 
that method with surprising or undesirable results.

Note that you can also declare an entire class final. A class that 
is declared final cannot be subclassed. This is particularly useful,
for example, when creating an immutable class like the String class.
*/