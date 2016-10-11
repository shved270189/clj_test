(ns clojtest.views.countries-test
  (:require [clojure.test :refer :all]
            [clojtest.core :refer :all]
            [clojtest.views.countries :as render]))

(def fake-country-title "Urkaine")

(def fake-countries [{"title" fake-country-title}])

(defn countries-renderer
  [country]
  (is (= country fake-country-title)))

(deftest countries-test
  (testing "countries."
           (render/countries fake-countries countries-renderer)))
