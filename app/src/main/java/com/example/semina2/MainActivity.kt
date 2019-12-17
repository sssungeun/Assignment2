package com.example.semina2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.semina2.Data.GitRepoItem
import com.example.semina2.Feature.GitRepoAdapter
import com.example.semina2.Feature.GitRepoViewHolder

class MainActivity : AppCompatActivity() {

    private lateinit var rvMainGitRepo: RecyclerView
    private lateinit var gitRepoAdapter : GitRepoAdapter
    private var login: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initGitRepoList()

    }
    private fun initGitRepoList() {
        rvMainGitRepo = findViewById(R.id.rv_item_profile)

        gitRepoAdapter = GitRepoAdapter(this)

        rvMainGitRepo.adapter = gitRepoAdapter
        rvMainGitRepo.layoutManager = LinearLayoutManager(this)


        //gitRepoAdapter.data = gitRepoAdapter.getRepos(login)
        gitRepoAdapter.notifyDataSetChanged()

        gitRepoAdapter.data = listOf(
            GitRepoItem(
                profileName = "SoptStagram",
                profileDetail = "IT 창업 동아리 SOPT 안드로이드 교육 프로젝트",
                profileImg = "https://search.naver.com/search.naver?where=image&sm=tab_jum&query=%ED%94%84%EB%A1%9C%ED%95%84%EC%95%84%EC%9D%B4%EC%BD%98#"
//                buttonImg = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxODAzMjVfNzcg%2FMDAxNTIxOTgyNDMzNzg5.jpdu8BnqGVgiNkgwPMRX3A35C1iSicOYyNAKz1uzhUgg.cn6DGEp85NDw6ygkQVnK0WPUHcaK6m1iTuP-gb_eNs4g.PNG.koowq%2F%25C7%25C1%25B7%25CE%25C7%25CA_%25BF%25F8%25C7%25FC%25BD%25C9%25C7%25C3%25BE%25C6%25C0%25CC%25C4%25DC-06.png&type=b400"
            ),
            GitRepoItem(
                profileName = "wave_android",
                profileDetail = "Forked from artic_development/wave_android",
                profileImg = "https://search.naver.com/search.naver?where=image&sm=tab_jum&query=%ED%94%84%EB%A1%9C%ED%95%84%EC%95%84%EC%9D%B4%EC%BD%98#"


            ),
            GitRepoItem(
                profileName = "CalculatorWithEspresso",
                profileDetail = "UI Test with Espresso + Unit Test Calculator",
                profileImg = "https://search.naver.com/search.naver?where=image&sm=tab_jum&query=%ED%94%84%EB%A1%9C%ED%95%84%EC%95%84%EC%9D%B4%EC%BD%98#"

            ),
            GitRepoItem(
                profileName = "problemSovingGuZongMan",
                profileDetail = "프로그래밍 대회에서 배우는 알고리즘 문제해결전략 공부하자",
                profileImg = "https://search.naver.com/search.naver?where=image&sm=tab_jum&query=%ED%94%84%EB%A1%9C%ED%95%84%EC%95%84%EC%9D%B4%EC%BD%98#"

            )
        )
        //데이터 변경 알려주기
        gitRepoAdapter.notifyDataSetChanged()
    }

}