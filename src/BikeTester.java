class BikeTester
{
    public static void main(String s[])
    {
        Bike1 bike = new Bike1("Hero Honda", "Shine", 125);
        bike.mileage = 72.5;
        bike.diskBrakes = false;

        System.out.println(bike.company + "'s " + bike.model + " has " + bike.cc + "cc power.");
    }
}

class Bike1
{
    Bike1(String companyParam, String modelParam, int ccParam)
    {
        company = companyParam;
        model = modelParam;
        cc = ccParam;
    }

    Bike1()
    {
    }

    String company;
    String model;
    int cc;
    double mileage;
    boolean diskBrakes;
}
