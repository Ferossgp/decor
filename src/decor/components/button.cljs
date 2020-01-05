(ns decor.components.button)

(defn button [{:keys [type]} & children]
  (into [:button {:class "rounded-full py-2 px-4 border-2 border-blue-5000 background-blue-500"}]
        children))
