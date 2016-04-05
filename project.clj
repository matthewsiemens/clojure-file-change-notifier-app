(defproject file-change-notifier-app "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [file-change-notifier "0.1.3"]]
  :main ^:skip-aot file-change-notifier-app.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
