# Deeper look at Selenium
In this project I want to take a deeper look at [Selenium WebDriver](https://www.selenium.dev/documentation/en/webdriver/) for testing purposes.

I basically know how to use Selenium and things like _page object pattern_.
But all I know was only learned / executed in some rudimentary tutorials or workshops.
Now I want to learn how to use it in a more "enterprise like" environment (see [Requirment and questions section](#requirements-and-questions)).

As I really like using [JUnit Jupiter](https://junit.org/junit5/) for writing tests, I want to take a look at the [Selenium Jupiter extension](https://bonigarcia.github.io/selenium-jupiter/).
According to its documentation, this extension seems to be a powerful underlying framework, taking away many of the configuration work.  

Based on the things I (hopefully) learn when digging deeper into the usage, I hope to get more comfortable with the topic and maybe find ideas / ways to introduce it at work for more automatic tests.

# Requirements and questions

In this section I list requirements and questions I want to have a closer look at.
Those things include:

* Supporting multiple browsers (esp. `Internet Explorer` is a requirement at my work)
* "check out the repository and run"
* Run the tests on a separate CI server
* Isolation of tests
* Running tests in parallel (e.g. using [Selenium Grid](https://www.selenium.dev/documentation/en/grid/))
* Taking screenshots and maybe movies to document the test
* How to link test results and requirements for reports?
  * I want to have a look at this, because I think this point is more relevant for UI tests than for "classic" developers unit tests.
* Possibilities to design and document tests and the results, e.g. with test management tools like _HP ALM_.
  * How is this done in general?
  * Do projects even do this or do they "just" write tests?



