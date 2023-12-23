class Address{
    int ward;
    String province, street;

    public Address(int ward, String province, String street)
    {
        this.ward=ward;
        this.province=province;
        this.street=street;
    }

    public String toString()
    {
        return "Ward= "+this.ward+" province= "+this.province+" street= "+this.street;
    }
}