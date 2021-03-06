package com.bjpowernode.p2p.mapper.loan;

import com.bjpowernode.p2p.model.loan.BidInfo;

import java.util.List;
import java.util.Map;

public interface BidInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bid_info
     *
     * @mbggenerated Fri Oct 18 15:51:26 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bid_info
     *
     * @mbggenerated Fri Oct 18 15:51:26 CST 2019
     */
    int insert(BidInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bid_info
     *
     * @mbggenerated Fri Oct 18 15:51:26 CST 2019
     */
    int insertSelective(BidInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bid_info
     *
     * @mbggenerated Fri Oct 18 15:51:26 CST 2019
     */
    BidInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bid_info
     *
     * @mbggenerated Fri Oct 18 15:51:26 CST 2019
     */
    int updateByPrimaryKeySelective(BidInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bid_info
     *
     * @mbggenerated Fri Oct 18 15:51:26 CST 2019
     */
    int updateByPrimaryKey(BidInfo record);

    /**
     * 获取平台累计投资金额
     * @return
     */
    Double selectAllBidMoney();

    /**
     * 根据产品标识获取最近的投资记录（包含：用户信息）
     * @param paramMap
     * @return
     */
    List<BidInfo> selectBidInfoListByLoanId(Map<String, Object> paramMap);

    /**
     * 根据用户标识获取最近的投资记录（包含：产品信息）
     * @param paramMap
     * @return
     */
    List<BidInfo> selectRecenterBidInfoListByUid(Map<String, Object> paramMap);

    /**
     * 根据用户标识获取投资记录总记录
     * @param paramMap
     * @return
     */
    Long selectTotal(Map<String, Object> paramMap);

    /**
     * 根据产品标识获取产品的所有投资记录
     * @param loanId
     * @return
     */
    List<BidInfo> selectAllBidInfoListByLoanId(Integer loanId);
}