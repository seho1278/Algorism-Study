# 정렬 알고리즘 복잡도 Summary

| 정렬    | Best  | Avg        | Worst | 메모리   | 안정성 |
|-------|-------|------------|-------|-------|-----|
| 버블 정렬 | n     | n^2        | n^2   | 1     | o   |
| 삽입 정렬 | n     | n^2        | n^2   | 1     | o   |
| 선택 정렬 | n^2   | n^2        | n^2   | 1     | x   |
| 합병 정렬 | nlogn | nlogn      | nlogn | n     | o   |
| 힙 정렬  | nlogn | nlogn      | nlogn | 1     | x   |
| 퀵 정렬  | nlogn | nlogn      | n^2   | nlogn | x   |
| 트리 정렬 | nlogn | nlogn      | n^2   | n     | x   |
| 기수 정렬 | dn    | dn         | dn    | n + k | o   |
| 계수 정렬 | n + k | n + k      | n + k | n + k | o   |
| 셸 정렬  | nlogn      | gap에 따라 다름 | n^2   | 1     | x   |

- d : 정렬 대상 데이터 최대 자릿 수
- k : 정렬 대상 데이터 중 최대 값

