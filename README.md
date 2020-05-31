# Url shortener

The idea of project is to use short URL addresses to be redirected to original websites which have long URLs.

## Technologies
- Java
- Spring Boot
- Maven
- H2 Database
- HTML5
- CSS


## Installation

Download project and use following command inside target folder:

```bash
java -jar restfull_web_service_0.0.1-SNAPSHOT.jar
```

## Usage

Open website at address

```python
http://localhost:8080/
```
Copy address of website you want to store, e.g. https://www.put.poznan.pl/ and press submit. 

Then go to section "View all generated addresses" and use generated short url like this: 
```python
http://localhost:8080/redirect/<shorturl>
```
Links must have "https://" prefix.

Feel happy with your new redirection service :)

The only purpose of this project is to learn, but feel free to suggest new features.

## Screenshots

/index

![UrlShortenerImage1](https://github.com/Rayti/url-shortener/blob/master/src/main/resources/READMEimages/urlshortener1.png)

/generate

![UrlShortenerImage2](https://github.com/Rayti/url-shortener/blob/master/src/main/resources/READMEimages/urlshortener2.png)

/viewall

![UrlShortenerImage1](https://github.com/Rayti/url-shortener/blob/master/src/main/resources/READMEimages/urlshortener3.png)