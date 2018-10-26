# robotWars
En simulering där olika robotar åker runt i en värld.

## World
int width, height
Block[] world

### Konstruktor - En instans av world ska skapas direkt. Generate metoden ska köras i konstruktorn.
World()

Denna metoden skall skapa block-arrayen, vilket är hela världen. Lamp och fuelstation amount är mängden av given sak i världen.
generate(int lampAmount, int fuelStationAmount, worldSize): block[] world

## Block
double distanceToLight
double distanceToFuel
boolean isFuel
boolean isLamp
//boolean isWall

### Konstruktor
Block()

## Robot
boolean lightLover
int fuelLevel
int x
int y

### Konstruktor
Robot()

metoden skall flytta på roboten.
move(x,y)

Getters och setters för alla robotvariabler.
getX()
getY()
getFuelLevel()

setFuelLevel()

getLightLover()

# Yeah, I code in JAVA.

## J.AG
## A.
## V.ILL
## A.VLIDA



