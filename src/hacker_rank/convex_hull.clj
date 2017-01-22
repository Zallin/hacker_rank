(ns hacker-rank.convex-hull
  (:require [hacker-rank.utils :refer [points-from-stdin]]
            [hacker-rank.poly-perim :refer [poly-perim distance]]))

(defn min-coords [points]
  (apply min-key
         (fn [[x y]]
           (+ (Math/abs x) (Math/abs y)))
         points))

(defn min-polar-angle [[x0 y0 :as or] [x1 y1 :as e1] [x2 y2 :as e2]]
  (let [vector-mul (- (* (- x1 x0) (- y2 y0)) (* (- x2 x0) (- y1 y0)))]
    (cond (> vector-mul 0) e1
          (< vector-mul 0) e2
          :else (if (> (distance [or e1]) (distance [or e2])) e1 e2))))

(defn in? [coll val]
  (some #(= val %) coll))
  
(defn convex-hull [points]
  (loop [origin (min-coords points)
         res [origin]]
    (println origin)
    (println res)
    (let [new-origin (reduce (partial min-polar-angle origin) (remove #(= origin %) points))]
      (if (in? res new-origin)
        res
        (recur new-origin
               (conj res new-origin))))))

(defn solution []
  (->> (points-from-stdin)
       convex-hull
       poly-perim
       println))
