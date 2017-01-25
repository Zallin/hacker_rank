(ns hacker-rank.prefix-compression
  (:require [clojure.string :refer [starts-with? replace-first]]))

;; when i solved this exercise clojure 1.7.0 was used on hacker rank
;; therefore starts-with fun was not available

(defn compress [a b]
  (let [pre (->> (reductions str "" "abc")
                 (take-while #(starts-with? b %))
                 (last))]
    [pre (replace-first a pre "") (replace-first b pre "")]))

(defn solution []
  (let [[pre ra rb] (compress (read-line) (read-line))]
    (println (count pre) pre)
    (println (count ra) ra)
    (println (count rb) rb)))









                        
       
