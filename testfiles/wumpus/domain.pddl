(define (domain wumpus)
	(:requirements :strips :adl)
	(:predicates 	(HERO ?hero)
					(SQUARE ?square)
					(GOLD ?thing)
					(ARROW ?thing)

					(at ?hero ?square)
					(adjecent ?square ?square)
					(hold ?hero ?thing)
					(lies ?thing ?square)
					(possiblePit ?square)
					(possibleWumpus ?square)
					(breeze ?square)
					(stench ?square)

					
	);

(:types ); default object



(:action MOVE
	:parameters ( 
		?hero
		?from
		?to)
	:precondition (and (HERO ?hero) (at ?hero ?from) (adjecent ?from ?to) (not (possiblePit ?to)) (not (possibleWumpus ?to)) )
	:effect (and (at ?hero ?to) (not (at ?hero ?from)))
)

(:action MARKNOPIT
	:parameters (
		?hero
		?standing
		?mark)
	:precondition (and (HERO ?hero) (at ?hero ?standing) (adjecent ?standing ?mark) (not (breeze ?standing)) (possiblePit ?mark))
	:effect (not (possiblePit ?mark))
)

(:action MARKNOWUMPUS
	:parameters (
		?hero
		?standing
		?mark
	)
	:precondition (and (HERO ?hero) (at ?hero ?standing) (adjecent ?standing ?mark) (not (stench ?standing)) (possibleWumpus ?mark))
	:effect (not (possibleWumpus ?mark))
)

(:action SLAUGHTER
	:parameters (
		?hero
		?arrow
		?from
		?to
	)
	:precondition (and (HERO ?hero) (ARROW ?arrow) (adjecent ?from ?to) (at ?hero ?from) (hold ?hero ?arrow) )
	:effect (and (not (possibleWumpus ?to )) (not (hold ?hero ?arrow)) )
)

(:action TAKE_GOLD
	:parameters (
		?hero
		?square
		?gold)
	:precondition (
		and (GOLD ?gold) (SQUARE ?square) (HERO ?hero)
		(lies ?gold ?square) (at ?hero ?square))
	:effect (
		and (hold ?hero ?gold) (not (lies ?gold ?square)))
)

)
