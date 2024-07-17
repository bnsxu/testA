class Hello 
{
	public static void main(String[] args) 
	{
		GoodsDAO dao = new GoodsDAO();
		dao.insert();
		dao.update();

		MemberDAO mDao = new MemberDAO();
		mDao.insert();
	}
}
