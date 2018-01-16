# [Codecov][1] Clojure example

[![Build Status](https://travis-ci.org/codecov/example-clojure.svg?branch=master)](https://travis-ci.org/codecov/example-clojure)
[![codecov.io](https://codecov.io/github/codecov/example-clojure/coverage.svg?branch=master)](https://codecov.io/github/codecov/example-clojure?branch=master)

## Guide
### Travis Setup
Add to your `.travis.yml` file.
```yml
language: clojure

after_success:
- CLOVERAGE_VERSION=1.0.7-SNAPSHOT lein cloverage --codecov
- bash <(curl -s https://codecov.io/bash) -f target/coverage/codecov.json
```
### Producing Coverage Reports
> Add to your `project.clj`

```clojure
:plugins [[lein-cloverage "1.0.7-SNAPSHOT"]]
```

```
CLOVERAGE_VERSION=1.0.7-SNAPSHOT lein cloverage --codecov
```

This uses [cloverage with the @dlobue's codecov.io reporter](https://github.com/lshift/cloverage/pull/78).

## Support

### Contact
- Intercom (in-app messanger)
- Email: [support@codecov.io](mailto:support@codecov.io)
- Slack: [slack.codecov.io](https://slack.codecov.io)
- [gh/codecov/support](https://github.com/codecov/support)

1. More documentation at https://docs.codecov.io
2. Configure codecov through the `codecov.yml`  https://docs.codecov.io/docs/codecov-yaml

## License

MIT.

Originally authored by [Jakub Elżbieciak](https://elzbieciak.pl/).

[1]: https://codecov.io/