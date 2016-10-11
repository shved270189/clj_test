(ns clojtest.core
  (:require [clojtest.models.vk-api :as vk-api]
            [clojtest.views.countries :as render]
            [clojtest.models.keeper :as keep])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (render/countries
    (vk-api/get-countries)
    keep/to-countries-file))
