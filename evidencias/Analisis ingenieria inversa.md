## Análisis de Ofuscación e Ingeniería Inversa

Al decompilar el JAR ofuscado se observó que:

- Los nombres originales de clases fueron reemplazados por identificadores cortos.
- Los nombres de métodos y variables fueron alterados.
- Se mantiene la estructura del bytecode, pero la comprensión del código es considerablemente más difícil.
- La lógica puede inferirse, pero requiere análisis adicional.

### Conclusión

La ofuscación no elimina la posibilidad de ingeniería inversa; sin embargo, incrementa significativamente el esfuerzo necesario para comprender la estructura y funcionamiento interno del sistema.
