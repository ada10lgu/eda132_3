

(define (problem WUMPUS-BY-HAND)
(:domain wumpus)
(:objects h1-1 s00 s01 s10 s11 g1)
(:init
(HERO h1-1)
(SQUARE s00)
(SQUARE s01)
(SQUARE s10)
(SQUARE s11)
(GOLD g1)

(at h1-1 s00)
(alive h1-1)
(possiblePit s01)
(possiblePit s11)
(possiblePit s10)

(adjecent s00 s01)
(adjecent s00 s10)
(adjecent s11 s01)
(adjecent s11 s10)
(adjecent s01 s00)
(adjecent s01 s11)
(adjecent s10 s00)
(adjecent s10 s11)
(lies g1 s11)
)
(:goal
(and (hold h1-1 g1) (alive h1-1) (at h1-1 s00))
)
)


