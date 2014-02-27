

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
(besides s00 s01)
(besides s00 s10)
(besides s11 s01)
(besides s11 s10)
(besides s01 s00)
(besides s01 s11)
(besides s10 s00)
(besides s10 s11)
(lies g1 s01)
)
(:goal
(and (hold h1-1 g1) (at h1-1 s11))
)
)


