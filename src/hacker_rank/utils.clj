(ns hacker-rank.utils)

(defn points-from-stdin []
  (repeatedly (read-string (read-line))
              #(map read-string (clojure.string/split (read-line) #" "))))
  
