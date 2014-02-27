(define (domain wumpus)
	(:requirements :strips)
	(:predicates 	(HERO ?hero)
					(SQUARE ?square)
					(at ?hero ?square)
					(besides ?square ?square)
					(GOLD ?gold)
					(hold ?hero ?gold)
					(lies ?gold ?square)
	);

(:types ); default object

(:action MOVE
	:parameters ( 
		?hero
		?from
		?to)
	:precondition (
		and (HERO ?hero) (SQUARE ?from) (SQUARE ?to)
		(at ?hero ?from) (besides ?from ?to))
	:effect (
		and (not (at ?hero ?from)) (at ?hero ?to))
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
