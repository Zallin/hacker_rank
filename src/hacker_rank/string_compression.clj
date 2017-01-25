(ns hacker-rank.string-compression)

(defn compress [st]
  (->> (partition-by identity st)
       (map #(vector (first %) (count %)))
       flatten
       (remove #(= % 1))
       (apply str)))

(defn solution []
  (println (compress (read-line))))
