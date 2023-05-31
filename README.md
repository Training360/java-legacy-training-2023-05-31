# Munka a legacy kóddal

Cél: függőségek megszűntetése

Miért akarunk függőséget megszüntetni:

* Tesztelés nehézsége
* Architektúrális okból
* Érthetőség

* Parameterize constructor
* Parameterize method
* Primitivize parameter
* Subclass and Override Method
* Extract interface
  * Legbiztosabb, fordítási időben kiderül 
  * IDE támogatás
  * Kerüljük az `I` előtagot
* Extract implementer
* Adapt parameter
  * Amennyiben az Extract interface nem használható
  * Ez is interfészt vezet be
  * Nem jó a sok metódust tartalmazó interfész, melyből csak párat használunk
* Break Out Method Object
* Encapsulate Global References
* Introduce Instance Delegator
* Introduce Static Setter
* Replace Global Reference with Getter
* Expose Static Method
* Extract and Override Call
* Extract and Override Factory Method