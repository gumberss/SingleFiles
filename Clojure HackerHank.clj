Hello World N Times

(defn hello_word_n_times[n] (dotimes [_ n] (println "Hello World")))
____________________________________________________________


List Replication


(defn fun[times lists](dotimes [index (count lists)] ( dotimes [_ times] ( println (nth lists index )) )))

____________________________________________________________