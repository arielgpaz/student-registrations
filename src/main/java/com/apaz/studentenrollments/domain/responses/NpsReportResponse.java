package com.apaz.studentenrollments.domain.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NpsReportResponse {

    private List<CourseNpsResponse> npsList;

}
