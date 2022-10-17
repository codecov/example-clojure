# [Codecov][1] Clojure example

[![Build Status](https://github.com/codecov/example-clojure/actions/workflows/ci.yml/badge.svg)]
[![codecov.io](https://codecov.io/github/codecov/example-clojure/coverage.svg?branch=master)](https://codecov.io/github/codecov/example-clojure?branch=master)

## Guide
### GitHub Actions Step
Add to your workflows file.
```yml
  - name: Upload to Codecov (Action)
    uses: codecov/codecov-action@v2
    with:
      token: {{ token }}
```
or
```yml
  - name: Upload to Codecov (Uploader)
    run: |
      curl -Os https://uploader.codecov.io/latest/linux/codecov
      chmod +x codecov
      ./codecov -t {{ token }}
```
### Producing Coverage Reports
> Add to your `project.clj`

```clojure
:plugins [[lein-cloverage "1.1.1"]]
```

```
CLOVERAGE_VERSION=1.1.1 lein cloverage --codecov
```

This uses [cloverage with the @dlobue's codecov.io reporter](https://github.com/lshift/cloverage/pull/78).

1. More documentation at https://docs.codecov.io
2. Configure codecov through the `codecov.yml`  https://docs.codecov.io/docs/codecov-yaml

## License

MIT.

Originally authored by [Jakub Elżbieciak](https://elzbieciak.pl/).

We are happy to help if you have any questions. Please contact email our Support at [support@codecov.io](mailto:support@codecov.io)

[1]: https://codecov.io/
