fun main(){
        var call = names(listOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"))
        println(call)

        var x=height(listOf(40,60,20))
        println(x)

        var tsuma = person("tsuma",24,56,58)
        var lorna = person("lorna",30,156,70)
        var Nadine = person("Nadine",4,100,13)

        var people = listOf(tsuma,lorna,Nadine)
        var adults = people.sortedByDescending { p -> p. age}
        println(adults)

        var Hanna = person("Hanna",3,120,15)
        var lili = person("lili",6,170,17)

        var list = mutableListOf(Hanna,lili)
        println(people.plus(list))

        var audi = Car("KWD705",40)
        var volvo = Car("KWT605",60)
        var wish = Car("QFT254",20)

        var myCars = listOf(audi,volvo,wish)
        println(covarage(myCars))

    }

    fun names(name:List<String>):List<String>{
        var identity = mutableListOf<String>()
        name.forEachIndexed { index, s ->
            if (index %2 ==0){
                identity.add(s)
            }
        }
        return identity
    }

    fun height(numb:List<Int>):String {
        var heights = numb.sum()
        var meters = numb.average()
        var total = "$heights,$meters"

        return  total
        println(total)
    }

    data class person(var name:String, var age:Int,var height:Int, var weight:Int)


    fun individual(individuals:List<Any>):List<Any>{
        return listOf()
    }



    data class Car(var registration: String, var mileage: Int)



    fun covarage(numbs:List<Car>):Int {
        var mile = 0
        numbs.forEach { m -> m.mileage
            mile += m.mileage
        }
        var  miles = mile/numbs.count()
        return miles
    }
