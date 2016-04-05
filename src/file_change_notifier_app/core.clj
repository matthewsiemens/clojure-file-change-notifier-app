(ns file-change-notifier-app.core
  (:require [file-change-notifier.core :refer [check-for-modified-files]])
  (:gen-class))

(defn -main
  [& args]
  (let [config-filename (first args)]
    (check-for-modified-files config-filename)
    ))
