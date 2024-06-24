object ques03{
    def calculateTakeHomeSalary(normalHours: Int, otHours: Int,taxRate: Double) : Double ={
        
        var salary = normalHours * 250 + otHours * 80

        //calculating tax
        var tax = salary * taxRate

        var takeHomeSalary=salary - tax
           takeHomeSalary
    } 

    def main(args: Array[String]) : Unit ={
        var normalHours=40
        var otHours=30
        var taxRate=0.12

        var takeHomeSalary=calculateTakeHomeSalary(normalHours, otHours, taxRate)

        println("Take Home salary: Rs." + takeHomeSalary)
    }
}