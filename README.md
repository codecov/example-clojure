# codecov.io, Clojure example

[![Build Status](https://travis-ci.org/codecov/example-clojure.svg?branch=master)](https://travis-ci.org/codecov/example-clojure)
[![codecov.io](https://codecov.io/github/codecov/example-clojure/coverage.svg?branch=master)](https://codecov.io/github/codecov/example-clojure?branch=master)

This repository contains a simple Clojure library with codecov.io integration.

It uses [cloverage with the @dlobue's codecov.io reporter](https://github.com/lshift/cloverage/pull/78).


## codecov.io setup in a Clojure project

> Add to your `project.clj`

```clojure
:plugins [[lein-cloverage "1.0.7-SNAPSHOT"]]
```

> Add to your `.travis.yml`

```yaml
after_success:
- CLOVERAGE_VERSION=1.0.7-SNAPSHOT lein cloverage --codecov
- bash <(curl -s https://codecov.io/bash) -f target/coverage/codecov.json
```


## License

MIT.

Originally authored by [Jakub Elżbieciak](https://elzbieciak.pl/).
