class CarFormatter{
    public CarDAO cardao;

    public CarFormatter(){
        cardao=new CarDAO();
    }
    public String getCarsNames()
    {
        List<Car> carsDb = cardao.getCars();
        StringBuilder sb = new StringBuilder();
        for (Car car : carsDb) {
            sb.append(car.getCarName());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
