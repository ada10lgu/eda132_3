

(define (problem BW-rand-13)
(:domain blocksworld)
(:objects b1 b2 b3 b4 b5 b6 b7 b8 b9 b10 b11 b12 b13 )
(:init
(arm-empty)
(on b1 b7)
(on b2 b9)
(on b3 b2)
(on b4 b10)
(on b5 b1)
(on b6 b11)
(on b7 b12)
(on-table b8)
(on b9 b6)
(on b10 b5)
(on b11 b8)
(on b12 b13)
(on b13 b3)
(clear b4)
)
(:goal
(and
(on b1 b5)
(on b3 b2)
(on b4 b12)
(on b7 b4)
(on b8 b1)
(on b10 b8)
(on b11 b3)
(on b12 b9)
(on b13 b6))
)
)


