# AE2 | Implementación comparativa de patrones de diseño

Proyecto de la Semana 3 de Diseño de Software (UCOM0310), centrado en la aplicación y comparación de los patrones **Factory Method** y **Builder** sobre un sistema de gestión de tutorías.

## Objetivo

Implementar dos patrones para resolver problemas diferentes:

- **Factory Method:** crear diferentes mecanismos de notificación sin acoplar el cliente a clases concretas.
- **Builder:** construir una `Reserva` con datos obligatorios y opcionales mediante una API fluida.

## Estructura

```text
src/main/java/edu/uees/patrones/
├── factory/
└── builder/
docs/
├── factory-method.puml
└── builder.puml
```

## Factory Method

### Problema inicial

Si el código que utiliza las notificaciones crea directamente `EmailNotificacion`, `SmsNotificacion`, `PushNotificacion`, etc., el cliente queda acoplado a cada implementación. Al agregar una nueva variante se deben modificar los puntos donde se realiza la creación.

### Solución

`Notificacion` funciona como Product, `NotificacionCreator` como Creator y las clases concretas representan los ConcreteProducts y ConcreteCreators. La creación queda delegada al método `crearNotificacion()`.

Variantes implementadas:

- Email
- SMS
- Push
- WhatsApp (variante adicional)

## Builder

### Problema inicial

Una `Reserva` puede necesitar varios datos obligatorios y opcionales. Un constructor con muchos parámetros resulta difícil de leer y aumenta la posibilidad de confundir argumentos.

### Solución

`ReservaBuilder` recibe los datos obligatorios y permite configurar los opcionales mediante métodos encadenables. `build()` valida los campos obligatorios y crea la reserva.

Valores por defecto:

- modalidad: `Presencial`
- tema: `Tutoría general`
- observaciones: vacío
- recordatorio: `true`

## Ejecución

El proyecto utiliza Maven y Java 17 como nivel de compilación. Se pueden ejecutar `FactoryMethodDemo` y `BuilderDemo` desde el IDE.

## Comparación

| Criterio | Factory Method | Builder |
|---|---|---|
| Problema que resuelve | Variabilidad en la creación de objetos | Construcción de objetos con múltiples opciones |
| Variabilidad principal | Tipo concreto del producto | Configuración del producto |
| Participantes | Product, ConcreteProduct, Creator, ConcreteCreator | Product y Builder |
| Ventaja principal | Desacopla la creación de las implementaciones concretas | Mejora legibilidad y flexibilidad de construcción |
| Costo / consecuencia | Aumenta el número de clases | Requiere una clase Builder adicional |
| Cuándo utilizarlo | Cuando existen variantes de un producto | Cuando un objeto tiene muchos parámetros opcionales |
| Cuándo evitarlo | Cuando solo existe una implementación estable | Cuando el objeto es simple y tiene pocos parámetros |

## Conclusiones

Factory Method y Builder solucionan problemas distintos. Factory Method resulta apropiado cuando la variabilidad está en **qué producto concreto se debe crear**, mientras que Builder resulta útil cuando la dificultad está en **cómo configurar y construir un objeto complejo**. En este caso, ambos patrones permiten mantener responsabilidades separadas y hacer que la evolución del sistema sea más controlada.

## Uso de IA

Para esta actividad se utilizaron herramientas de inteligencia artificial como apoyo durante la implementación y documentación. El contenido fue revisado, probado y adaptado, y el estudiante debe poder explicar y justificar el código y las decisiones de diseño presentadas.
