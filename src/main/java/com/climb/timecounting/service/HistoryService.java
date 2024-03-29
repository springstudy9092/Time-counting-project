package com.climb.timecounting.service;
import com.climb.timecounting.domain.History;
import com.climb.timecounting.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
@Transactional
public class HistoryService {

    private HistoryRepository historyRepository;

    @Autowired
    public HistoryService(HistoryRepository historyRepository) {
        this.historyRepository = historyRepository;
    }

    // 임시
    @Transactional(readOnly = true)
    public List<History> getHistoryList() {
        List<History> result = historyRepository.findAll();
        System.out.println("리스트 출력 " + result.toString());
        return result;
    }

    public List<History> historiesByGoal(String userId){
        //List<History> result = historyRepository.findAllByUser_id(userId);
        List<History> result = null;
        return result;
    }
}
