# Tecnicas de Elicitacion

## Técnica de elicitación — Encuesta

Nombre de la técnica: Encuesta (cuestionario estructurado)

Objetivo: Identificar necesidades, percepciones y prioridades de los actores involucrados en la gestión de donaciones de alimentos en Medellín.

Actores consultados: Donantes, beneficiarios, voluntarios y ciudadanos interesados en el proceso de donación de alimentos.

Instrumento: Cuestionario con preguntas demográficas, escala Likert, opción múltiple y preguntas abiertas.

Modalidad: Digital — formulario en línea.

Total encuestados: Aproximadamente 90 personas.

## Hallazgos principales:

Del análisis demográfico se encontró que el 37.8% de los encuestados tiene entre 18 y 25 años, siendo el grupo más receptivo a soluciones tecnológicas, mientras que el 57.8% participa solo ocasionalmente en actividades de donación y el 33.3% nunca lo ha hecho, lo que justifica la necesidad de un sistema más accesible y confiable.

En cuanto a las percepciones, el 52.3% considera que la desconfianza entre donantes y beneficiarios genera pérdida de alimentos, el 43.2% afirma que la falta de herramientas digitales contribuye al desperdicio y únicamente el 16.7% cree que los bancos de alimentos actuales cuentan con gestión tecnológica eficiente.

Respecto a las prioridades, el 68.9% señaló el seguimiento en tiempo real como la funcionalidad más importante, el 33.3% prefiere el acceso mediante centros físicos con registro digital y los encuestados mencionaron como factores de confianza la evidencia fotográfica y el respaldo institucional.

## Brechas confirmadas:

Brecha	Evidencia	Estado
Falta de trazabilidad digital	68% pidió seguimiento en tiempo real	Confirmada
Desconfianza entre actores	52% la asocia con pérdida de alimentos	Confirmada
Problemas logísticos	Impacto promedio de 3.83 / 5	Confirmada
Accesibilidad limitada	33% solicita registro físico digital	Confirmada
Uso de tecnologías complejas	Solo 28% mencionó blockchain	No priorizada

## Nuevas funcionalidades identificadas:

•	Registro de evidencias digitales (foto o firma)
•	Asignación automática de rutas de recolección
•	Modo híbrido: centros físicos + plataforma digital

## Trazabilidad encuesta → Requisitos Funcionales:

Hallazgo	RF originado
68.9% prioriza seguimiento en tiempo real	RF11
52.3% ve desconfianza como pérdida de alimentos	RF4, RF9
43.2% atribuye desperdicio a falta de herramientas	RF3, RF7
33.3% prefiere centros físicos con registro digital	RF8
29.5% señala logística como factor clave	RF6
Comentarios: alertas automáticas de vencimiento	RF3, RF7
Comentarios: plataforma accesible desde móvil	RF1, RF10
Comentarios: transparencia en distribución	RF9, RF11
Nueva func.: registro de evidencias	RF4
Nueva func.: asignación automática de rutas	RF6
Nueva func.: modo híbrido físico + digital	RF8

