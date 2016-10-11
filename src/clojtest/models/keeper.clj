(ns clojtest.models.keeper)

(def file-name { :countries "countries.txt" })

(defn to-file
  ([file row]
    (to-file file row true))
  ([file row append]
    (spit file row :append append)
    (spit file "\n" :append append)))

(defn to-countries-file
  [row]
  (to-file (get file-name :countries) row))
