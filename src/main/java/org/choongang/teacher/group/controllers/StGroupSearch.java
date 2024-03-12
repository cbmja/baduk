package org.choongang.teacher.group.controllers;

import lombok.Data;

@Data
public class StGroupSearch {

    private int page =1;

    private int limit = 10;//한 페이지에 보여줄 로우 수
    private String sopt="ALL"; // 검색옵션
    private String skey=""; // 검색 키워드
    private String type=""; // 상황마다 다르게 쿼리 날리기 위해

}
