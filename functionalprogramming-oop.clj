; Excercise 3
;Implement add-squares.
(apply + (map (fn [x] (* x x)) '(1 2 5))) 
; Excercise 4
; Factorial of 5 without recursion and loops
(apply * (range 1 6))
;take
(take 3 (filter even? (range 10) ))
;distinct & concat
(distinct(concat [1 2 3] [1 4 5]))
;repeat
(repeat 2 (range 5))
;interleave
(interleave (range 10 20) (range 30 40))
;drop
(drop 2 (range 10))
;drop-last
(drop-last 2 (range 10))
;flatten
(flatten [100 101 [200 [300 301]201]])
;partition
(partition 3 (range 10))
;every
(every? odd?'(1 3 5))