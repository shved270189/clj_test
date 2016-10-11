(ns clojtest.views.countries)

(defn countries
  ([couns]
    (countries couns println))
  ([couns renderer]
  (doseq
    [country-data couns]
    (let [country-title (get country-data "title")]
    (renderer country-title)))))
