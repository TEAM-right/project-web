package com.teamright.brokurly.customer.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamright.brokurly.customer.mapper.MyPageMapper;
import com.teamright.brokurly.model.DetailOrderVO;
import com.teamright.brokurly.model.ProductVO;

@Service
public class MyPageOrderListServiceImpl implements MyPageOrderListService {

	@Autowired
	MyPageMapper myPageMapper;
	
	// Map�� �̿��ؼ� �ֹ���ȣ�� ��ǰ����Ʈ ��� ����
	@Override
	public List<List<ProductVO>> getOrderList(String customer_id) {
		List<DetailOrderVO> idAndCount = myPageMapper.getOrderIdAndCount(customer_id); // �ֹ���ȣ ���� ����
		List<ProductVO> products = myPageMapper.getListByOrder(customer_id); // �������̵� �޾Ƽ� ��� �ֹ� ��ǰ ����
		
		Map<Integer, List<ProductVO>> division = new HashMap<>();
		List<List<ProductVO>> orderList = new ArrayList<>();
		
		// �ֹ���ȣ�� �̾Ƽ� Ű ������ ����
		for (int i = 0; i < idAndCount.size(); i++) {
			division.put(idAndCount.get(i).getOrder_id(), new ArrayList<>());
		}
		// �ֹ���ȣ�� ��ǰ ������ ����
		for (int i = 0; i < products.size(); i++) {
			for (Integer key : division.keySet()) {
				if (products.get(i).getOrder_id().equals(key)) {
					division.get(key).add(products.get(i));
				}
			}
		}
		// �з��� ����Ʈ�� �ٽ� ����Ʈ�� ����
		for (Integer key : division.keySet()) {
			orderList.add(division.get(key));
		}
		
		return orderList;
	}
}