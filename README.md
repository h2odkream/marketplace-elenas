# serenitybdd-web
Un proyecto base para automatización web usando serenityBDD, gradle y scraenplay 

En el archivo serenity.properties, cambiar la propiedad webdriver.chrome.driver a:
```
- Sistema operativo mac: webdriver.chrome.driver = src/test/resources/drivers/chromedriver_mac
- Sistema operativo windows: webdriver.chrome.driver = src/test/resources/drivers/chromedriver_win
```

# Correr las pruebas de manera exitosa
Para correr las pruebas de manera exitosa, en el features/create_user.feature, se debe cambiar el correo y el número de teléfono.
#### Nota:
No es necesario que sean datos reales.

Las pruebas se corren con el comando `gradle test aggregate`.
La documentación viva será generada en `target/site/serenity/index.html`

## Pipeline CI:
El pipeline está creado en Github Actions, por lo que se encuentra en ./github/workflows/ci.yaml.