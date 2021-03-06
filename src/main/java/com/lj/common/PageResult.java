package com.lj.common;

/**
 * 
 * @ClassName: PageResult  
 * @Description:
 * @author: LiangJun 
 * @date: 2019年6月28日 下午8:34:41   
 * @version : V1.0
 */
public class PageResult<T> extends Result<T> {
	/**
	 * 第几页
	 */
	private Integer pageNo;
	/**
	 * 每页显示
	 */
	private Integer pageSize;
	/**
	 * 总页数
	 */
	private Integer totalPage;
	/**
	 * 总数量
	 */
	private Integer total;

	public PageResult(String errorCode, String errorMsg) {
		super(errorCode, errorMsg);
	}

	public PageResult(Integer pageNo, Integer pageSize, Integer total, T obj) {
		super(obj);
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.total = total;
	}

	// get&set
	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSzie) {
		this.pageSize = pageSzie;
	}

	/**
	 * 计算总页数
	 * 
	 * @return 总页数
	 */
	public Integer getTotalPage() {
		totalPage = total / pageSize;
		if (total % pageSize != 0) {
			totalPage++;
		}
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

}
