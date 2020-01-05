(ns decor.showroom.components.button
  (:require [devcards.core]
            [decor.components.button :as button])
  (:require-macros [devcards.core :as dc :refer [defcard-doc defcard-rg]]))

(defcard-doc
  "
  # Button
  `decor.components.button`
  ")

(defcard-rg kind
  "
  ## Button kinds
  "
  [:div
   [button/button {:type :primary}
    "Just a button"]])
