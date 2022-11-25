# Serenitybdd móvil
Un proyecto base para automatización móvil usando Appium, serenityBDD, gradle y scraenplay 

En el archivo serenity.properties, cambiar las siguientes propiedades por las correspondientes:
```
 - appium.platformName
 - appium.deviceName
 - appium.platformVersion
```

### Nota:
El proyecto solo corre en dispositivos Android.

Las pruebas se corren con el comando `gradle test aggregate`.
La documentación viva será generada en `target/site/serenity/index.html`
