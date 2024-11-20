package com.example.navigasiwithdata.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.navigasiwithdata.model.RencanaStudy
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class RencanaStudyViewModel : ViewModel() {
    private val _krsState = MutableStateFlow(RencanaStudy())
    val krsStateUi: StateFlow<RencanaStudy> = _krsState.asStateFlow()
}

fun setMataKuliah(mkPilihan: String){
    _krsState.update {stateKelas -> stateMK.copy(namaMK = mkPilihan)}
}

