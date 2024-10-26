package com.example.cryptowalletapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.cryptowalletapp.R
import com.example.cryptowalletapp.databinding.FragmentHomeBinding
import com.jjoe64.graphview.GraphView
import com.jjoe64.graphview.GridLabelRenderer
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    lateinit var lineGraphView: GraphView
    lateinit var lineGraphView2: GraphView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        lineGraphView = root.findViewById(R.id.idGraphView)
        lineGraphView2 = root.findViewById(R.id.idGraphView2)

        graphe1()
        graphe2()

        return root
    }

    fun graphe1() {
        val series: LineGraphSeries<DataPoint> = LineGraphSeries(
            arrayOf(
                DataPoint(0.0, 10.0),
                DataPoint(1.0, 12.0),
                DataPoint(2.0, 4.0),
                DataPoint(3.0, 7.0),
                DataPoint(4.0, 6.0),
                DataPoint(5.0, 2.0),
                DataPoint(6.0, 11.0),
                DataPoint(7.0, 19.0),
                DataPoint(8.0, 18.0),
                DataPoint(9.0, 15.0),
                DataPoint(10.0, 16.0),
                DataPoint(11.0, 14.0),
                DataPoint(12.0, 17.0),
                DataPoint(13.0, 15.0),
                DataPoint(14.0, 13.0),
                DataPoint(15.0, 14.0),
                DataPoint(16.0, 16.0),
                DataPoint(17.0, 18.0)
            )
        )

        series.color = resources.getColor(R.color.yellow, null)

        lineGraphView.gridLabelRenderer.apply {
            isHorizontalLabelsVisible = false
            isVerticalLabelsVisible = false
            gridStyle = GridLabelRenderer.GridStyle.NONE
        }

        lineGraphView.viewport.isScrollable = false
        lineGraphView.viewport.isScalable = false
        lineGraphView.viewport.setScalableY(false)
        lineGraphView.viewport.setScrollableY(false)

        lineGraphView.addSeries(series)
    }

    fun graphe2() {
        val series: LineGraphSeries<DataPoint> = LineGraphSeries(
            arrayOf(
                DataPoint(0.0, 1.0),
                DataPoint(1.0, 3.0),
                DataPoint(2.0, 4.0),
                DataPoint(3.0, 9.0),
                DataPoint(4.0, 6.0),
                DataPoint(5.0, 3.0),
                DataPoint(6.0, 6.0),
                DataPoint(7.0, 1.0),
                DataPoint(8.0, 3.0)
            )
        )

        series.color = resources.getColor(R.color.purple, null)

        lineGraphView2.gridLabelRenderer.apply {
            isHorizontalLabelsVisible = false
            isVerticalLabelsVisible = false
            gridStyle = GridLabelRenderer.GridStyle.NONE
        }

        lineGraphView2.viewport.isScrollable = false
        lineGraphView2.viewport.isScalable = false
        lineGraphView2.viewport.setScalableY(false)
        lineGraphView2.viewport.setScrollableY(false)

        lineGraphView2.addSeries(series)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}